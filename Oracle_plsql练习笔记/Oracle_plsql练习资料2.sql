 --SQL的类型
--SQL> 1、DML（Data Manipulation Language 数据操作语言）: select insert update delete
--SQL> 2、DDL(Data Definition Language 数据定义语言): create table,alter table,truncate table,drop table
--SQL>                                                create/drop view,sequnece,index,synonym(同义词)
--SQL> 3、DCL(Data Control Language 数据控制语言): grant(授权) revoke(撤销权限)




--ete和truncate的区别
--SQL> 1、delete逐条删除；truncate先摧毁表 再重建2
--SQL> 2、（*）delete是DML  truncate是DDL
--SQL>         (可以回滚)         （不可以回滚）
--SQL> 3、delete不会释放空间 truncate会
--SQL> 4、delete会产生碎片 truncate不会
--SQL> 5、delete可以闪回(flashback)  truncate不可以
--SQL> */
--SQL> --flashback其实是一种恢复
--SQL> set feedback off
--SQL> @d:\temp\testdelete.sql
--SQL> select count(*) from testdelete;





--SQL> 注意的问题：
--SQL> 1、参与运算的各个集合必须列数相同 且类型一致
--SQL> 2、采用第一个集合作为最后的表头
--SQL> 3、order by永远在最后
--SQL> 4、括号
--SQL> */
  select deptno,job,sum(sal) from emp group by deptno,job
     union
     select deptno,to_char(null),sum(sal) from emp group by deptno
     union
     select to_number(null),to_char(null),sum(sal) from emp;
     
     
     --rownum 行号  rownum永远按照默认的顺序生成 --rownum 永远从1开始 
 select rownum,empno,ename,sal from emp;
 
 
 -- rownum只能使用< <=；不能使用> >=
 select rownum,empno,ename,sal from emp where  rownum<=8;
 
 
-- 子查询中的注意的问题：1
--> 1、括号
--> 2、合理的书写风格
--> 3、可以在主查询的where select having  from 后面使用子查询
--> 4、不可以在group by使用子查询
--> 5、强调from后面的子查询
--> 6、主查询和子查询可以不是同一张表；只有子查询返回的结果 主查询可以使用 即可
--> 7、一般不在子查询中排序；但在top-n分析问题中 必须对子查询排序
--> 8、一般先执行子查询，再执行主查询；但相关子查询例外
--> 9、单行子查询只能使用单行操作符；多行子查询只能使用多行操作符
--> 10、子查询中的null
--> --3、可以在主查询的where select having  from 后面使用子查询
 
--1相关子查询：
-- 查询员工部门号 员工名称 员工工资 和子查询得到的部门平均工资 从员工表和结果表查询
select e.empno,e.ename,e.sal,d.avgsal
 from emp e,(select deptno,avg(sal) avgsal from emp group by deptno) d;

  --2相关子查询： 将主查询中的值 作为参数传递给子查询
 --查询员工工号 名称 工资 和 列显示子查询员工平均工资从员工表中,条件部门表部门号=员工表表部门号
 select empno,ename,sal,(select avg(sal) from emp where deptno=e.deptno) avgsal
    from emp e
    where sal > (select avg(sal) from emp where deptno=e.deptno);
    --条件是员工工资大于所有部门平均工资的 
    
    
    
    --3子查询所要解决的问题：不能一步求解
 select * from emp
    where sal > (select sal
                from emp
                 where ename='JONES');
                 
                 
                 
 --4强调from后面的子查询
 --查询员工信息：员工号 姓名  月薪
 select * from (select empno,ename,sal from emp);

                 
--5查询员工信息：员工号 姓名  月薪 年薪

   select * from (select empno,ename,sal,sal*12 annsal from emp);

--6、主查询和子查询可以不是同一张表；只有子查询返回的结果 主查询可以使用 即可
 --查询所有员工从员工表这查,条件是部门名称等于指查询中SALES销售部的员工
 select * from emp where deptno=(select deptno from dept where dname='SALES');
 
--SQL优化 3、尽量使用多表查询 
 --in 在集合中
 --查询部门名称是SALES和ACCOUNTING的员工
 select * from emp
   where deptno in (select deptno from dept where dname='SALES' or dname='ACCOUNTING');
   
   
   
   --any: 和集合中的任意一个值比较
--查询工资比30号部门任意一个员工高的员工信息
 --方法1
 select * from emp
    where sal > any (select sal from emp where deptno=30);
   
 --方法2 工资只要大于30号部门中最少工资的员工
select *  from emp
   where sal > (select min(sal) from emp where deptno=30);
  
--all和集合中的所有值比较
 --查询工资比30号部门所有员工高的员工信息
 --方法1
 select * from emp
    where sal > all (select sal from emp where deptno=30);

--方法2 工资大于30号部门工资最高的员工
 select * from emp
  where sal > (select max(sal) from emp where deptno=30);
  
  --查询是老板的员工信息
 -- 方法1 in后面的查询结果可以有空窜null 查询结果会显示老板的工号位空 并不能单独显示老板的记录
  select * from emp where empno in (select mgr from emp);

-- 方法2 not in 后面的查询结果不能有空值null  实际是老板没有员工号 所有下面查询查询不到老板
    select * from emp where empno not in (select mgr from emp where mgr is not null);
