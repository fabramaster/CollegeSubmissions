import React, { useState } from 'react';
import { Menu, X, Upload, AlertCircle } from 'lucide-react';
import Papa from 'papaparse';

const AddClass = () => {
  // State management
  const [isSideNavOpen, setIsSideNavOpen] = useState(false);
  const [students, setStudents] = useState([]);
  const [formData, setFormData] = useState({
    className: '',
    classId: ''
  });
  const [error, setError] = useState('');
  const [isSubmitting, setIsSubmitting] = useState(false);

  // CSV file handling
  const handleFileUpload = (event) => {
    const file = event.target.files[0];
    
    if (!file) return;
    
    if (file.type !== "text/csv") {
      setError('Please upload a valid CSV file');
      return;
    }

    Papa.parse(file, {
      complete: (results) => {
        const validStudents = results.data
          .filter(row => row.length === 3 && row.every(cell => cell.trim()))
          .map(row => ({
            name: row[0].trim(),
            id: row[1].trim(),
            email: row[2].trim()
          }));

        if (validStudents.length === 0) {
          setError('No valid student data found in CSV. Format should be: Name,ID,Email');
          return;
        }

        setStudents(validStudents);
        setError('');
      },
      error: (error) => {
        setError(`Error parsing CSV: ${error.message}`);
      },
      skipEmptyLines: true,
      header: false
    });
  };

  // Form handling
  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  };

  // Form submission
  const handleSubmit = async (e) => {
    e.preventDefault();
    
    if (!formData.className || !formData.classId) {
      setError('Please fill out both class name and class ID');
      return;
    }

    if (students.length === 0) {
      setError('Please upload a CSV file with student data');
      return;
    }

    setIsSubmitting(true);
    setError('');

    try {
      const response = await fetch('/add-class', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          class_name: formData.className,
          class_id: formData.classId,
          students: students
        })
      });

      const data = await response.json();

      if (data.success) {
        window.location.href = '/prof-dashboard';
      } else {
        setError(data.message || 'Failed to add class');
      }
    } catch (err) {
      setError('Network error occurred. Please try again.');
    } finally {
      setIsSubmitting(false);
    }
  };

  return (
    <div className="min-h-screen bg-gray-50">
      {/* Top Navigation */}
      <nav className="fixed top-0 left-0 right-0 bg-indigo-600 h-16 flex items-center justify-between px-4 z-50">
        <button
          onClick={() => setIsSideNavOpen(!isSideNavOpen)}
          className="text-white hover:bg-indigo-500 p-2 rounded-lg transition-colors"
        >
          {isSideNavOpen ? <X size={24} /> : <Menu size={24} />}
        </button>
        <span className="text-white font-semibold">Add New Class</span>
        <div className="w-10" /> {/* Spacer */}
      </nav>

      {/* Side Navigation */}
      <div 
        className={`fixed top-0 left-0 h-full bg-indigo-600 transition-all duration-300 ${
          isSideNavOpen ? 'w-64' : 'w-0'
        } overflow-hidden z-40 pt-16`}
      >
        <div className="flex flex-col text-white">
          <div className="px-4 py-2 bg-indigo-700 font-semibold">Navigation</div>
          <a 
            href="/prof-dashboard" 
            className="px-4 py-3 hover:bg-indigo-500 transition-colors"
          >
            Back to Dashboard
          </a>
        </div>
      </div>

      {/* Main Content */}
      <main className={`pt-24 px-4 transition-all duration-300 ${isSideNavOpen ? 'ml-64' : 'ml-0'}`}>
        <div className="max-w-4xl mx-auto">
          <div className="bg-white rounded-lg shadow-lg p-6">
            {/* Error Display */}
            {error && (
              <div className="mb-6 flex items-center gap-2 p-4 bg-red-50 text-red-700 rounded-lg">
                <AlertCircle size={20} />
                <span>{error}</span>
              </div>
            )}

            {/* File Upload */}
            <div className="mb-8">
              <label className="block mb-2 font-medium">Upload Student List (CSV)</label>
              <div className="flex items-center justify-center w-full">
                <label className="flex flex-col items-center justify-center w-full h-32 border-2 border-dashed border-gray-300 rounded-lg cursor-pointer bg-gray-50 hover:bg-gray-100">
                  <div className="flex flex-col items-center justify-center pt-5 pb-6">
                    <Upload className="w-8 h-8 mb-2 text-gray-500" />
                    <p className="mb-2 text-sm text-gray-500">
                      <span className="font-semibold">Click to upload</span> or drag and drop
                    </p>
                    <p className="text-xs text-gray-500">CSV file with Name, ID, Email columns</p>
                  </div>
                  <input 
                    type="file" 
                    className="hidden" 
                    accept=".csv"
                    onChange={handleFileUpload}
                  />
                </label>
              </div>
            </div>

            {/* Students Table */}
            {students.length > 0 && (
              <div className="mb-8 overflow-x-auto">
                <table className="w-full text-sm">
                  <thead className="bg-gray-50">
                    <tr>
                      <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                        Name
                      </th>
                      <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                        ID
                      </th>
                      <th className="px-6 py-3 text-left text-xs font-medium text-gray-500 uppercase tracking-wider">
                        Email
                      </th>
                    </tr>
                  </thead>
                  <tbody className="bg-white divide-y divide-gray-200">
                    {students.map((student, index) => (
                      <tr key={index}>
                        <td className="px-6 py-4 whitespace-nowrap">{student.name}</td>
                        <td className="px-6 py-4 whitespace-nowrap">{student.id}</td>
                        <td className="px-6 py-4 whitespace-nowrap">{student.email}</td>
                      </tr>
                    ))}
                  </tbody>
                </table>
              </div>
            )}

            {/* Class Information Form */}
            <form onSubmit={handleSubmit} className="space-y-6">
              <div>
                <label className="block mb-2 font-medium">Class Name</label>
                <input
                  type="text"
                  name="className"
                  value={formData.className}
                  onChange={handleInputChange}
                  className="w-full p-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500"
                  placeholder="Enter class name"
                />
              </div>

              <div>
                <label className="block mb-2 font-medium">Class ID</label>
                <input
                  type="text"
                  name="classId"
                  value={formData.classId}
                  onChange={handleInputChange}
                  className="w-full p-2 border border-gray-300 rounded-lg focus:ring-2 focus:ring-indigo-500 focus:border-indigo-500"
                  placeholder="Enter class ID"
                />
              </div>

              <button
                type="submit"
                disabled={isSubmitting}
                className={`w-full py-2 px-4 rounded-lg text-white font-medium ${
                  isSubmitting 
                    ? 'bg-indigo-400 cursor-not-allowed' 
                    : 'bg-indigo-600 hover:bg-indigo-700'
                }`}
              >
                {isSubmitting ? 'Creating Class...' : 'Create Class'}
              </button>
            </form>
          </div>
        </div>
      </main>
    </div>
  );
};

export default AddClass;