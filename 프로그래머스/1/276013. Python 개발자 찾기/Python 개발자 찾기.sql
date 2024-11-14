-- 코드를 작성해주세요

select id, email, first_name, last_name from developer_infos
    where skill_3 = 'Python' or skill_1 ='Python' or skill_2 = 'Python'
    order by id
    