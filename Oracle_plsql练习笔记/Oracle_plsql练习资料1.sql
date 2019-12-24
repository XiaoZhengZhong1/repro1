-- 转字符函数  lower('HELLOW') 把括号字符转小写
-- upper('hello') 把括号字符转大写
-- initcap('hello') 把括号首字母转大写
select lower('HELLOW') 转小写, upper('hello') 转大写, initcap('hello') 首字母转大写
 from dual;
 
 -- substr(a,b,c) 从a中，第b位开始取，取c位
 select substr('helloworld',3,1) 演示截取字符串 from dual;
 
 -- length('hello')表示字符长度  lengthb('hello')表示字节长度
 select length('hello') 查字符长度, lengthb('hello') 查字节长度  from dual;
 
 -- instr('hello','e')表示在hello中查找e的位置
 select instr('hello','e') from dual;
 
  -- lpad 左填充  rpad 右填充  
  select lpad('a',3,'b') from dual;
-- 表示中a的左边填充b,填充至满3位数(包括a)

    -- trim 去掉前后指定的字符
    select trim('  where  ') from dual;
    
    -- trunc(truncate) 截取以小数为单位
select trunc(888.888,2),trunc(888.888,1),trunc(888.888,-1),trunc(888.888,-2) from dual; 
    -- 截取至2小数888.88  截取至1位888.8  截取至-1位小数个位数880,没有小数用0代替
    
        -- replace替换 
    select replace('helloworld','w',9) from dual;
        -- hello9orld
        
        -- round 四舍五入
        select round(888.888,2),round(888.888,1),round(888.888,-1),round(888.888,-2) from dual;
        -- 保留两位小数888.89           888.9            890                 900   
        
-- 计算员工工龄:思路用当前日期减入职日期除365
select ename,hiredate,(sysdate-hiredate)/365 年 from emp;        


--查询3个月后add_months(sysdate,3)
 select add_months(sysdate,3) from dual;


                                                                         

 -- 查询当前月的最后一天last_day
 select last_day(sysdate) from dual;

      --下一个星期四 next_day(sysdate,'星期四')
select next_day(sysdate,'星期四') from dual;   


 --查询员工的薪水：两位小数99、千位符、本地货币代码L   9代表小数 ,逗号代表千位符 L代表本地货币
 select to_char(sal,'L9,999.99') from emp;    
 
 -- -nullif(a,b) 当a=b的时候，返回null；否则返回a
  select nullif('abc','ac') 值 from dual;

  --给员工涨工资，总裁1000 经理800 其他400
   select ename,job,sal 涨前,
           case job when 'PRESIDENT' then sal+1000
                    when 'MANAGER' then sal+800
                    else sal+400
            end 涨后
    from emp;
  
            
                       
