import React, { useState } from 'react';
import { Search, ChevronDown, ExternalLink } from 'lucide-react';

// FAQ Data structure
interface FAQItem {
  question: string;
  answer: string | string[];
}

interface FAQSection {
  title: string;
  items: FAQItem[];
}

const faqData: FAQSection[] = [
  {
    title: "General Information",
    items: [
      {
        question: "What is the Ethics Board's role?",
        answer: "The Ethics Board reviews and evaluates ethical dilemmas and research proposals to ensure they meet established ethical guidelines and standards. We provide guidance and recommendations to protect human subjects and maintain ethical integrity in research."
      },
      {
        question: "How long does the review process take?",
        answer: "Standard reviews typically take 4-6 weeks from submission. Expedited reviews may be completed in 2-3 weeks. Complex cases may require additional time for thorough evaluation."
      }
    ]
  },
  {
    title: "Submission Guidelines",
    items: [
      {
        question: "What should I include in my submission?",
        answer: [
          "Detailed project description",
          "Methodology and procedures",
          "Risk assessment and mitigation strategies",
          "Consent forms and participant information",
          "Data handling and privacy protection measures"
        ]
      },
      {
        question: "How do I submit an urgent review request?",
        answer: "For urgent reviews, submit your request through the standard form and click the \"Expedited Review\" option. Include justification for the urgency in your submission. Note that not all requests will qualify for expedited review."
      }
    ]
  },
  {
    title: "Review Process",
    items: [
      {
        question: "What are the possible outcomes of a review?",
        answer: [
          "Approve the proposal",
          "Request modifications",
          "Require additional information",
          "Reject the proposal with detailed explanation"
        ]
      },
      {
        question: "Can I appeal a decision?",
        answer: "Yes, appeals can be submitted within 30 days of receiving the decision. Include new information or clarifications that address the concerns raised in the initial review."
      }
    ]
  }
];

const FAQSection: React.FC<{ section: FAQSection }> = ({ section }) => {
  const [expandedItems, setExpandedItems] = useState<number[]>([]);

  const toggleItem = (index: number) => {
    setExpandedItems(prev => 
      prev.includes(index) 
        ? prev.filter(i => i !== index)
        : [...prev, index]
    );
  };

  return (
    <div className="mb-8">
      <div className="text-2xl font-bold mb-4 text-indigo-600 border-b-2 border-indigo-600 pb-2">
        {section.title}
      </div>
      <div className="space-y-4">
        {section.items.map((item, index) => (
          <div 
            key={index}
            className="bg-gray-50 rounded-lg overflow-hidden"
          >
            <button
              onClick={() => toggleItem(index)}
              className="w-full px-6 py-4 flex justify-between items-center hover:bg-gray-100 transition-colors"
            >
              <span className="font-semibold text-lg text-gray-800">
                {item.question}
              </span>
              <ChevronDown 
                className={`transform transition-transform ${
                  expandedItems.includes(index) ? 'rotate-180' : ''
                }`}
              />
            </button>
            {expandedItems.includes(index) && (
              <div className="px-6 py-4 text-gray-600">
                {Array.isArray(item.answer) ? (
                  <ul className="list-disc pl-5 space-y-2">
                    {item.answer.map((point, i) => (
                      <li key={i}>{point}</li>
                    ))}
                  </ul>
                ) : (
                  <p>{item.answer}</p>
                )}
              </div>
            )}
          </div>
        ))}
      </div>
    </div>
  );
};

const FAQ: React.FC = () => {
  const [searchTerm, setSearchTerm] = useState('');

  const filteredData = searchTerm
    ? faqData.map(section => ({
        ...section,
        items: section.items.filter(item =>
          item.question.toLowerCase().includes(searchTerm.toLowerCase()) ||
          (typeof item.answer === 'string' 
            ? item.answer.toLowerCase().includes(searchTerm.toLowerCase())
            : item.answer.some(a => a.toLowerCase().includes(searchTerm.toLowerCase())))
        )
      })).filter(section => section.items.length > 0)
    : faqData;

  return (
    <div className="min-h-screen bg-indigo-600 py-12">
      <div className="max-w-4xl mx-auto px-4">
        <div className="text-center mb-12">
          <h1 className="text-4xl font-bold text-white mb-8">
            FAQ & Help Documentation
          </h1>
          <div className="relative">
            <input
              type="text"
              placeholder="Search FAQs..."
              value={searchTerm}
              onChange={(e) => setSearchTerm(e.target.value)}
              className="w-full px-4 py-3 rounded-lg pl-12 focus:outline-none focus:ring-2 focus:ring-indigo-500"
            />
            <Search className="absolute left-4 top-1/2 transform -translate-y-1/2 text-gray-400" />
          </div>
        </div>

        <div className="bg-white rounded-xl shadow-xl p-8">
          {filteredData.map((section, index) => (
            <FAQSection key={index} section={section} />
          ))}
          
          <button 
            onClick={() => window.location.href = '#contact'}
            className="mt-8 bg-indigo-600 text-white px-6 py-3 rounded-lg mx-auto block hover:bg-indigo-700 transition-colors flex items-center gap-2"
          >
            Contact Ethics Board
            <ExternalLink size={20} />
          </button>
        </div>
      </div>
    </div>
  );
};

export default FAQ;