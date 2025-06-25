CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(p_DepartmentID NUMBER, p_BonusPercent NUMBER) IS
BEGIN
    FOR emp IN (SELECT EmployeeID, Salary FROM Employees WHERE DepartmentID = p_DepartmentID) LOOP
        UPDATE Employees
        SET Salary = Salary + (Salary * p_BonusPercent / 100)
        WHERE EmployeeID = emp.EmployeeID;

        DBMS_OUTPUT.PUT_LINE('Bonus applied to EmployeeID: ' || emp.EmployeeID 
            || ', New Salary: ' || TO_CHAR(emp.Salary + (emp.Salary * p_BonusPercent / 100), '9999999.99'));
    END LOOP;

    COMMIT;
END;
/
