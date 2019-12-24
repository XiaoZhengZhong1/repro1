 --SQL������
--SQL> 1��DML��Data Manipulation Language ���ݲ������ԣ�: select insert update delete
--SQL> 2��DDL(Data Definition Language ���ݶ�������): create table,alter table,truncate table,drop table
--SQL>                                                create/drop view,sequnece,index,synonym(ͬ���)
--SQL> 3��DCL(Data Control Language ���ݿ�������): grant(��Ȩ) revoke(����Ȩ��)




--ete��truncate������
--SQL> 1��delete����ɾ����truncate�ȴݻٱ� ���ؽ�2
--SQL> 2����*��delete��DML  truncate��DDL
--SQL>         (���Իع�)         �������Իع���
--SQL> 3��delete�����ͷſռ� truncate��
--SQL> 4��delete�������Ƭ truncate����
--SQL> 5��delete��������(flashback)  truncate������
--SQL> */
--SQL> --flashback��ʵ��һ�ָֻ�
--SQL> set feedback off
--SQL> @d:\temp\testdelete.sql
--SQL> select count(*) from testdelete;





--SQL> ע������⣺
--SQL> 1����������ĸ������ϱ���������ͬ ������һ��
--SQL> 2�����õ�һ��������Ϊ���ı�ͷ
--SQL> 3��order by��Զ�����
--SQL> 4������
--SQL> */
  select deptno,job,sum(sal) from emp group by deptno,job
     union
     select deptno,to_char(null),sum(sal) from emp group by deptno
     union
     select to_number(null),to_char(null),sum(sal) from emp;
     
     
     --rownum �к�  rownum��Զ����Ĭ�ϵ�˳������ --rownum ��Զ��1��ʼ 
 select rownum,empno,ename,sal from emp;
 
 
 -- rownumֻ��ʹ��< <=������ʹ��> >=
 select rownum,empno,ename,sal from emp where  rownum<=8;
 
 
-- �Ӳ�ѯ�е�ע������⣺1
--> 1������
--> 2���������д���
--> 3������������ѯ��where select having  from ����ʹ���Ӳ�ѯ
--> 4����������group byʹ���Ӳ�ѯ
--> 5��ǿ��from������Ӳ�ѯ
--> 6������ѯ���Ӳ�ѯ���Բ���ͬһ�ű�ֻ���Ӳ�ѯ���صĽ�� ����ѯ����ʹ�� ����
--> 7��һ�㲻���Ӳ�ѯ�����򣻵���top-n���������� ������Ӳ�ѯ����
--> 8��һ����ִ���Ӳ�ѯ����ִ������ѯ��������Ӳ�ѯ����
--> 9�������Ӳ�ѯֻ��ʹ�õ��в������������Ӳ�ѯֻ��ʹ�ö��в�����
--> 10���Ӳ�ѯ�е�null
--> --3������������ѯ��where select having  from ����ʹ���Ӳ�ѯ
 
--1����Ӳ�ѯ��
-- ��ѯԱ�����ź� Ա������ Ա������ ���Ӳ�ѯ�õ��Ĳ���ƽ������ ��Ա����ͽ�����ѯ
select e.empno,e.ename,e.sal,d.avgsal
 from emp e,(select deptno,avg(sal) avgsal from emp group by deptno) d;

  --2����Ӳ�ѯ�� ������ѯ�е�ֵ ��Ϊ�������ݸ��Ӳ�ѯ
 --��ѯԱ������ ���� ���� �� ����ʾ�Ӳ�ѯԱ��ƽ�����ʴ�Ա������,�������ű��ź�=Ա������ź�
 select empno,ename,sal,(select avg(sal) from emp where deptno=e.deptno) avgsal
    from emp e
    where sal > (select avg(sal) from emp where deptno=e.deptno);
    --������Ա�����ʴ������в���ƽ�����ʵ� 
    
    
    
    --3�Ӳ�ѯ��Ҫ��������⣺����һ�����
 select * from emp
    where sal > (select sal
                from emp
                 where ename='JONES');
                 
                 
                 
 --4ǿ��from������Ӳ�ѯ
 --��ѯԱ����Ϣ��Ա���� ����  ��н
 select * from (select empno,ename,sal from emp);

                 
--5��ѯԱ����Ϣ��Ա���� ����  ��н ��н

   select * from (select empno,ename,sal,sal*12 annsal from emp);

--6������ѯ���Ӳ�ѯ���Բ���ͬһ�ű�ֻ���Ӳ�ѯ���صĽ�� ����ѯ����ʹ�� ����
 --��ѯ����Ա����Ա�������,�����ǲ������Ƶ���ָ��ѯ��SALES���۲���Ա��
 select * from emp where deptno=(select deptno from dept where dname='SALES');
 
--SQL�Ż� 3������ʹ�ö���ѯ 
 --in �ڼ�����
 --��ѯ����������SALES��ACCOUNTING��Ա��
 select * from emp
   where deptno in (select deptno from dept where dname='SALES' or dname='ACCOUNTING');
   
   
   
   --any: �ͼ����е�����һ��ֵ�Ƚ�
--��ѯ���ʱ�30�Ų�������һ��Ա���ߵ�Ա����Ϣ
 --����1
 select * from emp
    where sal > any (select sal from emp where deptno=30);
   
 --����2 ����ֻҪ����30�Ų��������ٹ��ʵ�Ա��
select *  from emp
   where sal > (select min(sal) from emp where deptno=30);
  
--all�ͼ����е�����ֵ�Ƚ�
 --��ѯ���ʱ�30�Ų�������Ա���ߵ�Ա����Ϣ
 --����1
 select * from emp
    where sal > all (select sal from emp where deptno=30);

--����2 ���ʴ���30�Ų��Ź�����ߵ�Ա��
 select * from emp
  where sal > (select max(sal) from emp where deptno=30);
  
  --��ѯ���ϰ��Ա����Ϣ
 -- ����1 in����Ĳ�ѯ��������пմ�null ��ѯ�������ʾ�ϰ�Ĺ���λ�� �����ܵ�����ʾ�ϰ�ļ�¼
  select * from emp where empno in (select mgr from emp);

-- ����2 not in ����Ĳ�ѯ��������п�ֵnull  ʵ�����ϰ�û��Ա���� ���������ѯ��ѯ�����ϰ�
    select * from emp where empno not in (select mgr from emp where mgr is not null);
