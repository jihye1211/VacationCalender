import React, { useState, useEffect } from 'react';
import axios from 'axios';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import "./test.css";

function Calendar(props) {
    const [selectedDate, setSelectedDate] = useState(null);

    const handleChange = (date) => {
        setSelectedDate(date);
    };

    useEffect(() => {
        axios.get('/api/hello')
        .catch(error => console.log(error))
    }, []);
    return (
        // 캘린더 컴포넌트 구현 내용 작성
        <DatePicker dateFormat="yymmdd" selected={selectedDate} onChange={handleChange} />
    );
}

export default Calendar;
