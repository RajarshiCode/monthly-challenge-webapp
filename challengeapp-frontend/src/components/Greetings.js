import { useState } from "react";



function Greetings({name,message}) {

    const [messageState, setMessage] = useState(message);
    const changeMessage = () => setMessage('GoodBye');

    return(
        <div>
            <h2>Hello,{name}!</h2>
            <p>{messageState}</p>
            <button onClick={changeMessage}>Change Message</button>
        </div>
        
    ); 
}

export default Greetings;