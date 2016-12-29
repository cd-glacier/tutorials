import React, { PropTypes } from "react"

const NumBtn = ({n, onClick}) => (
  <button onClick={onClick}>{n}</button>
)

NumBtn.propType = {
  onClick: PropTypes.func.isRequired,
};

export default NumBtn
