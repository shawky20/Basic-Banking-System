import React from "react";
import BasicCard from "../card/card";
import styles from  "./dashboard.modules.css";

function Dashboard() {
    const costumers = [{name:"cust1", email:"cust1@gmail.com" ,balance :"100",},
                          {name:"cust2", email:"cust2@gmail.com" ,balance:"100",},
                            {name:"cust3", email:"cust3@gmail.com" ,balance: "100",},
                        ];
    return (
        <div className={styles.dashboard}>
                <div className="dashboard__row">
                    {
                        costumers.map((costumer, index) => (
                            <BasicCard key={index} name={costumer.name} email={costumer.email} balance={costumer.balance} />
                        ))
                    }
                </div>
        </div>
    );
    }

export default Dashboard;