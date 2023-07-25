import {createStore} from 'redux';

const initialState = {
    transferAmount: 0,
};

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case 'INCREASE':
            return {transferAmount: state.transferAmount + action.payload};
        case 'DECREASE':
            return {transferAmount: state.transferAmount - action.payload};

        default:
            return state;
    }
};

const store = createStore(reducer);

export default store;
