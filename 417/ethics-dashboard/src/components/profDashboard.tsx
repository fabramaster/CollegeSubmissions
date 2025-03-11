import React, { useState, useEffect } from 'react';
import { Menu, X, ChevronDown, LogOut } from 'lucide-react';

const ProfessorDashboard = () => {
  const [isSideNavOpen, setIsSideNavOpen] = useState(false);
  const [isDashboardVisible, setIsDashboardVisible] = useState(false);
  const [isClassesVisible, setIsClassesVisible] = useState(false);
  const [classes, setClasses] = useState(["BUAD 123", "COSC 470", "PHIL 350"]);
  const [sessionData, setSessionData] = useState({
    name: "Professor Name",
    email: "prof@example.com"
  });

  // Mock data for dashboard stats
  const dashboardData = {
    thumbsUpPercent: 70,
    thumbsDownPercent: 30,
    relationsPercent1: 65,
    relationsPercent2: 35,
    actionDutyPercent1: 50,
    actionDutyPercent2: 50,
    characterVirtuePercent1: 80,
    characterVirtuePercent2: 20
  };

  const QuadrantChart = ({ title, value1, value2 }) => (
    <div className="bg-gradient-to-br from-indigo-600 to-indigo-400 rounded-lg p-6 flex flex-col items-center">
      <h3 className="text-xl font-bold text-white mb-4">{title}</h3>
      <div className="relative w-32 h-32">
        <div 
          className="w-full h-full rounded-full"
          style={{
            background: `conic-gradient(
              #23b56c ${value1}%, 
              #ab1c1c ${value1}% 100%
            )`
          }}
        />
      </div>
      <div className="flex justify-center gap-4 mt-4">
        <span className="text-green-400">{value1}%</span>
        <span className="text-red-400">{value2}%</span>
      </div>
    </div>
  );

  const SideNav = () => (
    <div className={`fixed top-0 left-0 h-full bg-indigo-600 transition-all duration-300 ${isSideNavOpen ? 'w-64' : 'w-0'} overflow-hidden z-50`}>
      <div className="pt-16 flex flex-col">
        <SideNavSection title="Start Here - Choose A Case">
          <SideNavLink href="#">Describe The Dilemma</SideNavLink>
        </SideNavSection>
        
        <SideNavSection title="Consequences">
          <SideNavLink href="#">Stakeholders</SideNavLink>
        </SideNavSection>

        <SideNavSection title="Action and Duty">
          <SideNavLink href="#">Role</SideNavLink>
          <SideNavLink href="#">Past Actions</SideNavLink>
          <SideNavLink href="#">Reason</SideNavLink>
        </SideNavSection>

        <SideNavSection title="Relations">
          <SideNavLink href="#">Care Ethics</SideNavLink>
          <SideNavLink href="#">Intersectionality</SideNavLink>
          <SideNavLink href="#">Seven Generations</SideNavLink>
        </SideNavSection>
      </div>
    </div>
  );

  const SideNavSection = ({ title, children }) => (
    <div className="mb-4">
      <div className="px-4 py-2 bg-indigo-700 text-white font-bold text-sm uppercase">
        {title}
      </div>
      {children}
    </div>
  );

  const SideNavLink = ({ href, children }) => (
    <a href={href} className="px-6 py-3 text-white hover:bg-white hover:text-indigo-600 block transition-colors">
      {children}
    </a>
  );

  const TopNav = () => (
    <div className="fixed top-0 left-0 w-full bg-indigo-600 h-16 flex items-center justify-between px-4 z-40">
      <button
        onClick={() => setIsSideNavOpen(!isSideNavOpen)}
        className="text-white hover:bg-indigo-500 p-2 rounded"
      >
        {isSideNavOpen ? <X size={24} /> : <Menu size={24} />}
      </button>
      
      <div className="text-white">Welcome, {sessionData.name}</div>
      
      <button className="text-white hover:bg-indigo-500 p-2 rounded">
        <LogOut size={24} />
      </button>
    </div>
  );

  const Dashboard = () => (
    <div className="grid grid-cols-2 gap-6 p-6">
      <QuadrantChart 
        title="Consequences" 
        value1={dashboardData.thumbsUpPercent}
        value2={dashboardData.thumbsDownPercent}
      />
      <QuadrantChart 
        title="Relations"
        value1={dashboardData.relationsPercent1}
        value2={dashboardData.relationsPercent2}
      />
      <QuadrantChart 
        title="Action & Duty"
        value1={dashboardData.actionDutyPercent1}
        value2={dashboardData.actionDutyPercent2}
      />
      <QuadrantChart 
        title="Character & Virtue"
        value1={dashboardData.characterVirtuePercent1}
        value2={dashboardData.characterVirtuePercent2}
      />
    </div>
  );

  const ClassesList = () => (
    <div className="grid grid-cols-2 gap-4 p-6">
      {classes.map((className, index) => (
        <div 
          key={index}
          onClick={() => window.location.href = `/view-class?class=${encodeURIComponent(className)}`}
          className="bg-indigo-600 text-white p-6 rounded-lg text-center cursor-pointer hover:bg-indigo-500 transition-colors"
        >
          {className}
        </div>
      ))}
      <div 
        onClick={() => window.location.href = "/add-class"}
        className="border-2 border-dashed border-indigo-600 text-indigo-600 p-6 rounded-lg text-center cursor-pointer hover:bg-indigo-50 transition-colors"
      >
        Add New Class
      </div>
    </div>
  );

  return (
    <div className="min-h-screen bg-gray-50">
      <TopNav />
      <SideNav />
      
      <main className={`pt-20 px-4 transition-all duration-300 ${isSideNavOpen ? 'ml-64' : 'ml-0'}`}>
        <h1 className="text-3xl font-bold text-center mb-8">Professor Dashboard</h1>
        
        <div className="max-w-6xl mx-auto">
          <button 
            onClick={() => setIsDashboardVisible(!isDashboardVisible)}
            className="w-full bg-indigo-600 text-white p-4 rounded-lg mb-4 flex items-center justify-center gap-2"
          >
            Dashboard <ChevronDown className={`transform transition-transform ${isDashboardVisible ? 'rotate-180' : ''}`} />
          </button>
          
          {isDashboardVisible && <Dashboard />}
          
          <button 
            onClick={() => setIsClassesVisible(!isClassesVisible)}
            className="w-full bg-indigo-600 text-white p-4 rounded-lg mb-4 flex items-center justify-center gap-2"
          >
            Manage Classes <ChevronDown className={`transform transition-transform ${isClassesVisible ? 'rotate-180' : ''}`} />
          </button>
          
          {isClassesVisible && <ClassesList />}
        </div>
      </main>
    </div>
  );
};

export default ProfessorDashboard;