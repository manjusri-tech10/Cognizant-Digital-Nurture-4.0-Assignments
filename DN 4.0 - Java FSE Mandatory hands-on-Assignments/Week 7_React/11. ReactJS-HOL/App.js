import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 1
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  };

  sayHello = () => {
    console.log("Hello! Value incremented.");
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleClick = (e) => {
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <p>{this.state.counter}</p>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome")}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>

        <hr />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
