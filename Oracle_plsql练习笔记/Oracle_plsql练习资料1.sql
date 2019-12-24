-- ת�ַ�����  lower('HELLOW') �������ַ�תСд
-- upper('hello') �������ַ�ת��д
-- initcap('hello') ����������ĸת��д
select lower('HELLOW') תСд, upper('hello') ת��д, initcap('hello') ����ĸת��д
 from dual;
 
 -- substr(a,b,c) ��a�У���bλ��ʼȡ��ȡcλ
 select substr('helloworld',3,1) ��ʾ��ȡ�ַ��� from dual;
 
 -- length('hello')��ʾ�ַ�����  lengthb('hello')��ʾ�ֽڳ���
 select length('hello') ���ַ�����, lengthb('hello') ���ֽڳ���  from dual;
 
 -- instr('hello','e')��ʾ��hello�в���e��λ��
 select instr('hello','e') from dual;
 
  -- lpad �����  rpad �����  
  select lpad('a',3,'b') from dual;
-- ��ʾ��a��������b,�������3λ��(����a)

    -- trim ȥ��ǰ��ָ�����ַ�
    select trim('  where  ') from dual;
    
    -- trunc(truncate) ��ȡ��С��Ϊ��λ
select trunc(888.888,2),trunc(888.888,1),trunc(888.888,-1),trunc(888.888,-2) from dual; 
    -- ��ȡ��2С��888.88  ��ȡ��1λ888.8  ��ȡ��-1λС����λ��880,û��С����0����
    
        -- replace�滻 
    select replace('helloworld','w',9) from dual;
        -- hello9orld
        
        -- round ��������
        select round(888.888,2),round(888.888,1),round(888.888,-1),round(888.888,-2) from dual;
        -- ������λС��888.89           888.9            890                 900   
        
-- ����Ա������:˼·�õ�ǰ���ڼ���ְ���ڳ�365
select ename,hiredate,(sysdate-hiredate)/365 �� from emp;        


--��ѯ3���º�add_months(sysdate,3)
 select add_months(sysdate,3) from dual;


                                                                         

 -- ��ѯ��ǰ�µ����һ��last_day
 select last_day(sysdate) from dual;

      --��һ�������� next_day(sysdate,'������')
select next_day(sysdate,'������') from dual;   


 --��ѯԱ����нˮ����λС��99��ǧλ�������ػ��Ҵ���L   9����С�� ,���Ŵ���ǧλ�� L�����ػ���
 select to_char(sal,'L9,999.99') from emp;    
 
 -- -nullif(a,b) ��a=b��ʱ�򣬷���null�����򷵻�a
  select nullif('abc','ac') ֵ from dual;

  --��Ա���ǹ��ʣ��ܲ�1000 ����800 ����400
   select ename,job,sal ��ǰ,
           case job when 'PRESIDENT' then sal+1000
                    when 'MANAGER' then sal+800
                    else sal+400
            end �Ǻ�
    from emp;
  
            
                       
