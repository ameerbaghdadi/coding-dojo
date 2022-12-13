import React, { useState } from 'react'

const Tabs = (props) => {

  return (
    <div>
        {props.tabs.map((tab, i) => <li onClick={(e) => props.selectTab(tab)} key={ i }>{ tab.label }</li>)}
    </div>
    
  )

  
}

export default Tabs
