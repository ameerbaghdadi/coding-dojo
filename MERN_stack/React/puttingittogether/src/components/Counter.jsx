import React, { Component } from 'react';

class Counter extends Component {
    constructor(props) {
        super(props);
        this.state = {
            counter: this.props.age,
        };
    }
    increment = () => {
      this.setState({counter: this.state.counter+=1});
    }
    
    render() {
        return (
            <div>
              <h1>{this.props.fname}, {this.props.lname}</h1>
                <p>Age: {this.state.counter}</p>
                <p>Hair Color: {this.props.hair}</p>
                <button onClick={this.increment}>Birthday Button for {this.props.fname} {this.props.lname}</button>
</div>
        );
    }
}
                
export default Counter;
