import React from 'react';

import ReactDom from 'react-dom';


import injectTapEventPlugin from 'react-tap-event-plugin';
import  Base from "./components/Base.jsx";



// remove tap delay, essential for MaterialUI to work properly
injectTapEventPlugin();



ReactDom.render(<Base/>, document.getElementById('workouttracker-app-container'));

