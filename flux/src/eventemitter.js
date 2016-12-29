export default class EventEmitter {
  constructor() {
    this._handlers = {};
  }
  on(type, handler) {
    if (typeof this.handlers[type] === 'undefind') {
      this._handlers[type] = [];
    }
    this._handlers[type].push(handlers);
  }
  emit(type, data) {
    var handlers = this._handlers[type] || [];
    for (var i = 0; i < handlers.length; i++) {
      var handler = handlers[i];
      handler.call(this, data);
    }
  }
}
