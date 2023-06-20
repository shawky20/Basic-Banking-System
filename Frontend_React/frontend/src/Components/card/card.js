import * as React from 'react';
import Box from '@mui/material/Box';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import "./card.css";


export default function BasicCard(props) {
  return (
    // <div className="Card" > 
    <Card sx={{ minWidth: 275 , maxWidth : 300 }} className="Card">
      <CardContent>
        <Typography sx={{ fontSize: 28 }} color="text.secondary" gutterBottom>
          {props.name}
        </Typography>
        <Typography variant="h5" component="div">
          {props.email}
        </Typography>
        <br></br>
        <Typography variant="body2">
         Balance:
          <br />
          {props.balance}
        </Typography>
      </CardContent>
      <CardActions style={{ display: 'flex', justifyContent: 'center', alignItems: 'center' }}>
            <Button size="small" style={{ border: '1px solid black', color: 'black', ':hover': { border: '1px solid red', background: 'red' } }}>Transfer</Button>
      </CardActions>
    </Card>
    // </div>
  );
}
