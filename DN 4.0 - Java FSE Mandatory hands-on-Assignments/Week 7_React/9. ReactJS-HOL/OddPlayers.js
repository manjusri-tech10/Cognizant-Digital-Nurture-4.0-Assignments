import React from 'react';

const OddPlayers = ({ IndianTeam }) => {
  const oddPlayers = IndianTeam.filter((_, index) => index % 2 !== 0);
  return (
    <ul>
      {oddPlayers.map((player, index) => (
        <li key={index}>{player}</li>
      ))}
    </ul>
  );
};

export default OddPlayers;
