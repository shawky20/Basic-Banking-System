import React, { Fragment } from "react";
import BasicCard from "../card/card";
import styles from  "./dashboard.modules.css";

function Dashboard() {
    // uncontrolled component is using useRef hook
    // controlled component is using useState hook it is more secure and more flexible
    const Amount = React.useRef(null); // to get the value of the input field beacuse we can't use document.getElementById so use useRef hook instead
    const [costumers, setCostumers] = React.useState([{name:"cust1", email:"cust1@gmail.com" ,balance :"100",},
                                                      {name:"cust2", email:"cust2@gmail.com" ,balance:"100",},
                                                      {name:"cust3", email:"cust3@gmail.com" ,balance: "10",},]);

    // const costumers = [{name:"cust1", email:"cust1@gmail.com" ,balance :"100",},
    //                       {name:"cust2", email:"cust2@gmail.com" ,balance:"100",},
    //                         {name:"cust3", email:"cust3@gmail.com" ,balance: "100",},
    //                     ];

    function transfer(to){
        console.log("transfer to ", to);
        // new array of costumers
        if(Amount.current.value === ""){ 
            Amount.current.focus();
            return;
        } 
 
        const transfered = costumers.map((costumer) => { 
            if(costumer.name === to.name){
                return {...costumer, balance: parseInt(costumer.balance) + parseInt(Amount.current.value)};
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
        console.log("input value", Amount.current.value);
    }
    return (
        <Fragment>
            <div className="dashboard__container">
                <h1 className="dashboard__title">Dashboard</h1>
                <div  >
                    <label className="label">Transfer Amount</label>
                    <input className="input"  type="text" placeholder="Transfer Amount" ref = {Amount} onChange={inputHndler} />
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