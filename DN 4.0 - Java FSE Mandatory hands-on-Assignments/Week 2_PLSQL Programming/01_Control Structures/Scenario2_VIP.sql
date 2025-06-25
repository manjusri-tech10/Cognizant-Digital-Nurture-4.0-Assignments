BEGIN
    FOR cust IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers 
        SET IsVIP = 'Y' 
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Set VIP status for CustomerID: ' || cust.CustomerID);
    END LOOP;
    COMMIT;
END;
/
