import React, { useState } from 'react';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import './App.css';

function App() {
  const [showCourses, setShowCourses] = useState(true);
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);

  return (
    <div className="app">
      {showCourses && <CourseDetails />}
      <div className="separator" />
      {showBooks ? <BookDetails /> : <p>Books hidden</p>}
      <div className="separator" />
      {showBlogs && <BlogDetails />}
    </div>
  );
}

export default App;
