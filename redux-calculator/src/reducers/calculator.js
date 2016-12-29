import * as actionTypes from "../utils/actionTypes";

const initialAppState = {
  inputValue: 0,
  resultValue: 0,
  pushedBtn: "",
  beforeBtn: null,
  showingResult: false,
};

const calculator = (state = initialAppState, action) => {
  if (action.type === actionTypes.INPUT_NUMBER) {
    return {
      ...state,
      inputValue: state.inputValue * 10 + action.number,
      pushedBtn: state.pushedBtn + String(state.inputValue * 10 + action.number),
      showingResult: false,
    };
  } else if (action.type === actionTypes.PLUS) {
    return {
      ...state,
      inputValue: 0,
      resultValue: state.resultValue + state.inputValue,
      pushedBtn: state.pushedBtn + "+",
      beforeBtn: "PLUS",
      showingResult: false,
    };
  } else if (action.type === actionTypes.MINUS) {
    return {
      ...state,
      inputValue: 0,
      resultValue: state.inputValue - state.resultValue,
      pushedBtn: state.pushedBtn + "-",
      beforeBtn: "MINUS",
      showingResult: false,
    }
  } else if (action.type === actionTypes.EQUAL) {
    return {
      ...state,
      inputValue: 0,
      resultValue: (function(beforeBtn) {
        if (beforeBtn === "PLUS") {
          return state.resultValue + state.inputValue;
        } else if (beforeBtn === "MINUS") {
          return state.resultValue - state.inputValue;
        }
      })(state.beforeBtn),
      pushedBtn: state.pushedBtn + "=",
      showingResult: true,
    }
  } else if (action.type === actionTypes.CLEAR) {
    return {
      inputValue: 0,
      resultValue: 0,
      pushedBtn: "",
      showingResult: false,
    }
  } else {
    return state;
  }
};

export default calculator;
