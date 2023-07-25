import React, { Fragment } from "react";
import BasicCard from "../card/card";
import  "./dashboard.modules.css";
import customers from "../../Common/data/custumers";
import { useSelector, useDispatch } from 'react-redux';


function Dashboard() {
    // uncontrolled component is using useRef hook
    // controlled component is using useState hook it is more secure and more flexible
    const inputAmount = React.useRef(null); // to get the value of the input field beacuse we can't use document.getElementById so use useRef hook instead
    const [costumers, setCostumers] = React.useState(customers);
    
    const transferAmount = useSelector(state => state.transferAmount);
    const dispatch = useDispatch();
    

    function transfer(to){
        console.log("transfer to ", to);
        // new array of costumers
        if(inputAmount.current.value === ""){ 
            inputAmount.current.focus(); 
            return;
        } 
 
        const transfered = costumers.map((costumer) => { 
            if(costumer.name === to.name){
                return {...costumer, balance: parseInt(costumer.balance) + parseInt(inputAmount.current.value)};
            }
            else{
                return costumer;
            }
        });
        //! or using filter  msh btzbt 
        // const transfered = costumers.filter((costumer) => {
        //     if(costumer.name === to.name){
        //         return {...costumer, balance: parseInt(costumer.balance) + 10};
        //     }
        //     else{
        //         return costumer;
        //     }
        // });
        setCostumers(transfered);
    }

    function inputHndler(){
        console.log("input value", inputAmount.current.value);
    }

    function increaseAmount(){
        dispatch({type: 'INCREASE', payload: inputAmount.current.value === "" ? 0 : parseInt(inputAmount.current.value)});
    }

    function decreaseAmount(){
        dispatch({type: 'DECREASE', payload:  inputAmount.current.value === "" ? 0 : parseInt(inputAmount.current.value)});
    }

    return (
        <Fragment>
            <div className="dashboard__container">
                <h1 className="dashboard__title">Dashboard</h1>
                <div  >
                    <label className="label">Transfer Amount: {transferAmount} </label> 
                    
                    <br></br>       
                   <div className="input__container">
                        <button className="button" style={{margin : 50}} onClick={ () => increaseAmount()} >increase </button>
                        <button className="button" onClick={() => decreaseAmount()} >decrease </button>
                        <input className="input" type="number" ref={inputAmount} onChange={inputHndler} />
                    
                    </div>
                </div>
                <div className="dashboard__row">
                    {
                        costumers.map((costumer, index) => (
                            <BasicCard key={index} name={costumer.name} email={costumer.email} balance={costumer.balance} transfer={transfer} />
                        ))
                    }
                </div>
            </div>
        </Fragment>
    );
    }

export default Dashboard;