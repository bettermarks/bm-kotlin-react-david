import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import {validateEquation} from 'equation-validator';

ReactDOM.render(
    <React.StrictMode>
        <h1>Equation validator</h1>
        <p>Is <span className='equation'>1 + 2 = 3</span> valid? <span> {validateEquation("1 + 2 = 3")} </span></p>
        <p>Is <span className='equation'>1+2=3</span> valid? <span> {validateEquation("1+2=3")} </span></p>
        <p>Is <span className='equation'>EMPTY STRING</span> valid? <span> {validateEquation("")} </span></p>
        <p>Is <span className='equation'>1 + 2 = 5</span> valid? <span> {validateEquation("1 + 2 = 5")} </span></p>
        <p>Is <span className='equation'>not an equation</span> valid? <span> {validateEquation("not an equation")} </span></p>
        <p>Is <span className='equation'>1 + 2 + 3 = 6</span> valid? <span> {validateEquation("1 + 2 + 3 = 6")} </span></p>
        <p>Is <span className='equation'>1 - 2 = 3</span> valid? <span> {validateEquation("1 - 2 = 3")} </span></p>
    </React.StrictMode>,
    document.getElementById('root')
);
