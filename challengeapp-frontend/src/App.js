// import logo from './logo.svg';
import { useEffect, useState } from 'react';
import './App.css';
import ChallengeList from './components/ChallengeList';
import axios from 'axios';



function App() {

  const [challenges, setChallenges] = useState([
    
  ]);


  useEffect(() =>{
    const fetchChallenges = async () => {
      const response = await axios.get('http://localhost:8080/challenges');
      setChallenges(response.data);
    
    };
    fetchChallenges();
  },[] )

  return (
    <div className="App">

      <h1>Monthy Challenge</h1>
      {/* <ChallengeList></ChallengeList> */}

      <ChallengeList challenges={challenges} />




    </div>
  );
}

export default App;
