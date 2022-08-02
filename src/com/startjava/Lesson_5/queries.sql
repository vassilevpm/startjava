SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status != 'Destroyed';
SELECT * FROM jaegers WHERE mark = 'Mark - 1' OR mark = 'Mark - 6';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers ORDER BY launch DESC LIMIT 1;
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers) OR
    kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';
DELETE FROM jaegers WHERE status = 'Destroyed';
SELECT * FROM jaegers;