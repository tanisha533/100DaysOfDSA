# Write your MySQL query statement below
Select w.id from Weather w 
JOIN weather s 
on DATEDIFF(w.recordDate, s.recordDate)=1
AND w.temperature>s.temperature;