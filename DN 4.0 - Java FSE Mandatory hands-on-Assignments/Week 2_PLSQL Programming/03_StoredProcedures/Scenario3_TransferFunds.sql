CREATE OR REPLACE PROCEDURE TransferFunds(p_SourceAccountID NUMBER, p_TargetAccountID NUMBER, p_Amount NUMBER) IS
    v_SourceBalance NUMBER;
BEGIN
    SELECT Balance INTO v_SourceBalance FROM Accounts WHERE AccountID = p_SourceAccountID;
    IF v_SourceBalance < p_Amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in AccountID: ' || p_SourceAccountID);
    ELSE
        UPDATE Accounts
        SET Balance = Balance - p_Amount
        WHERE AccountID = p_SourceAccountID;
        UPDATE Accounts
        SET Balance = Balance + p_Amount
        WHERE AccountID = p_TargetAccountID;
            DBMS_OUTPUT.PUT_LINE('Transferred ' || p_Amount || ' from AccountID ' 
            || p_SourceAccountID || ' to AccountID ' || p_TargetAccountID);

        COMMIT;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Invalid Account ID provided.');
END;
/
