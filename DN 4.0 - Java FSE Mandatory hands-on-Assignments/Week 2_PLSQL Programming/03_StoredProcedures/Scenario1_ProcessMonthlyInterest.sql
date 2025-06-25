CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (SELECT AccountID, Balance FROM SavingsAccounts) LOOP
        UPDATE SavingsAccounts
        SET Balance = Balance + (Balance * 0.01)
        WHERE AccountID = acc.AccountID;

        DBMS_OUTPUT.PUT_LINE('Interest applied for AccountID: ' || acc.AccountID 
            || ', New Balance: ' || TO_CHAR(acc.Balance + (acc.Balance * 0.01), '9999999.99'));
    END LOOP;

    COMMIT;
END;
/
