import React from "react";
import officeList from "./officeData";

function App() {
  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1 style={{ fontWeight: "bold" }}>Office Space , at Affordable Range</h1>

      {officeList.map((office, index) => (
        <div key={index} style={{ marginBottom: "40px" }}>
          <img src={office.image} alt={office.name} width="250" height="200" />
          <h2>Name: {office.name}</h2>
          <p style={{ color: office.rent < 60000 ? "red" : "green", fontWeight: "bold" }}>
            Rent: Rs. {office.rent}
          </p>
          <p><strong>Address:</strong> {office.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
