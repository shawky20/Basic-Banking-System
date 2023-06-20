import React from "react";
import BasicCard from "../card/card";
import "./dashboard.css";

function Dashboard() {
    return (
        <div className="dashboard">
        <BasicCard name="cust1" email="cust1@gmail.com" balance ="100"/>
        </div>
    );
    }

export default Dashboard;