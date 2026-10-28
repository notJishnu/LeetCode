# Write your MySQL query statement below
SELECT U.user_id , CONCAT(UPPER(SUBSTR(U.name,1,1)),LOWER(SUBSTR(U.name,2))) AS name 
FROM Users U
ORDER BY
U.user_id ASC;
