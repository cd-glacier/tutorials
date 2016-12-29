import React from "react"
import ActionCreator from "./action.js"
import Store from "./store.js"
import EventEmitter from "./eventemitter.js"

var dispatcher = new EventEmitter();
var action = new ActionCreator();
var store = new Store();

export default class Component extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      count: store.getCount()
    };
    store.on("CHANGE", () => {
      this._onChange();
    });
  }
  _onChange() {
    this.setState({
      count: store.getCount()
    });
  }
  tick() {
    action.countUp(this.state.count + 1);
  }
  reder() {
    return (
      <div>
				<button onClick={this.tick.bind(this)}>Count Up</button>
				<p>
					Count: {this.state.count}
				</p>
			</div>
    )
  }
}
