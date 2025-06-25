BEGIN
    FOR loan_rec IN (
        SELECT LoanID, CustomerID, DueDate 
        FROM Loans 
        WHERE DueDate <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID 
            || ' for Customer ID ' || loan_rec.CustomerID 
            || ' is due on ' || TO_CHAR(loan_rec.DueDate,'DD-MON-YYYY'));
    END LOOP;
END;
/
