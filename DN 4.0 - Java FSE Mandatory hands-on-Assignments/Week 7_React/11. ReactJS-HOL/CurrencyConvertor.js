import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: 'Euro'
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, currency } = this.state;
    let rate = 80; // 1 Euro = 80 INR
    let convertedAmount = amount * rate;
    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Amount: </label>
            <input
              type="number"
              value={this.state.amount}
              onChange={this.handleAmountChange}
            />
          </div>
          <br />
          <div>
            <label>Currency: </label>
            <select value={this.state.currency} onChange={this.handleCurrencyChange}>
              <option value="Euro">Euro</option>
            </select>
          </div>
          <br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
