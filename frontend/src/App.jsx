import React from 'react'
import useAuth from './hooks/useAuth'
import Protected from './components/Protected';
import Public from './components/Public';

const App = () => {
  const isLogin = useAuth();
  return isLogin ? <Protected /> : <Public />;
}

export default App