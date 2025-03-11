import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import ProfessorDashboard from './components/profDashboard';
import AddClass from './components/addClass';
import FAQ from './components/FAQ';

const router = createBrowserRouter([
  {
    path: "/",
    element: <ProfessorDashboard />,
  },
  {
    path: "/prof-dashboard",
    element: <ProfessorDashboard />,
  },
  {
    path: "/add-class",
    element: <AddClass />,
  },
  {
    path: "/faq",
    element: <FAQ />,
  },
]);

function App() {
  return <RouterProvider router={router} />;
}

export default App;