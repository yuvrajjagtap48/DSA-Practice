public class loop {

    public static void maxSubArray(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            currSum = currSum + number[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {4, 6, 3, 6, 3, 5, 8, 8};
        maxSubArray(number);
    }
}


SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee );

SELECT name COUNT(*)                   
FROM employee
GROUP BY name
HAVING COUNT(*) > 1;

SELECT *
FROM employee
WHERE salary > (SELECT AVG(salary) FROM employee);

SELECT deparment, COUNT(*)
FROM employee
GROUP BY deparment;

SELECT deparment, COUNT(*)
FROM employee
GROUP BY deparment
HAVING COUNT(*) > 3;

SELECT e.*
FROM employee e
LEFT JOIN deparment d
ON e.dept_id = e.dept_id
WHERE d.dept_id IS NULL;

SELECT deparment, MAX(salary)
FROM employee
GROUP BY deparment;

SELECT * 
FROM employee
WHERE join_date >= CURRENT_DATE - INTERVAL '30' DAY;

SELECT DISTINCT salary
FROM employee
ORDER BY slary DESC
LIMIT 3;

SELECT *
FROM (
    SELECT salary,
           DENSE_RANK() OVER (ORDER BY salary DESC) AS r
    FROM employee
) t
WHERE r = N;
