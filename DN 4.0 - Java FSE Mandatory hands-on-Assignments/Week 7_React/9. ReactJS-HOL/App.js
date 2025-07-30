import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import Scorebelow70 from './components/Scorebelow70';
import OddPlayers from './components/OddPlayers';
import EvenPlayers from './components/EvenPlayers';
import ListofIndianPlayers from './components/ListofIndianPlayers';
function App() {
  const flag = true;
  const players = [
    { name: 'Rohit', score: 80 },
    { name: 'Kohli', score: 95 },
    { name: 'Rahul', score: 65 },
    { name: 'Pant', score: 40 },
    { name: 'Jadeja', score: 70 },
    { name: 'Shami', score: 50 },
    { name: 'Bumrah', score: 85 },
    { name: 'Gill', score: 60 },
    { name: 'Surya', score: 75 },
    { name: 'Ashwin', score: 45 },
    { name: 'Iyer', score: 78 },
  ];
  const IndianTeam = [
    'Rohit', 'Kohli', 'Rahul', 'Pant', 'Jadeja', 'Shami', 'Bumrah', 'Gill', 'Surya', 'Ashwin', 'Iyer'
  ];
  const T20Players = ['Kohli', 'Rohit', 'Surya', 'Gill'];
  const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Saha'];

  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers]; // Merging with spread operator

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers IndianTeam={IndianTeam} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers IndianTeam={IndianTeam} />
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListofIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;
