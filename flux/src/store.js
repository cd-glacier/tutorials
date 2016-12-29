import Emitter from "./eventemitter.js"

export default class Store extends Emitter {
  constructor(dispatcher) {
    super();
    dispatcher.on("countUp", this.onCountUp.bind(this));
  }
  getCount() {
    return this.count;
  }
  onCountUp(count) {
    this.count = count;
    this.emit("CHANGE");
  }
}
