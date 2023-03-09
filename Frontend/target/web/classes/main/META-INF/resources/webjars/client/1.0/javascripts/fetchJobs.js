// Pre-defined job data
const jobData = [
    {
        "title": "Undergraduate Teaching Assistant - MATH3302",
        "pay": "15$",
        "hours": "10hrs/week",
        "faculty": "Dr. John A",
        "image": "https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png",
        "detailLink": "#"
    },
    {
        "title": "Graduate Teaching Assistant - MATH5304",
        "pay": "20$",
        "hours": "15hrs/week",
        "faculty": "Dr. Jane B",
        "image": "https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png",
        "detailLink": "#"
    },
    {
        "title": "Research Assistant - PHYS2201",
        "pay": "25$",
        "hours": "20hrs/week",
        "faculty": "Dr. Mark C",
        "image": "https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png",
        "detailLink": "#"
    },
    {
        "title": "Graduate Research Assistant - CS7102",
        "pay": "30$",
        "hours": "25hrs/week",
        "faculty": "Dr. Alice D",
        "image": "https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png",
        "detailLink": "#"
    },
    {
        "title": "Part-time Instructor - ENGL1101",
        "pay": "35$",
        "hours": "30hrs/week",
        "faculty": "Dr. Peter E",
        "image": "https://styles.redditmedia.com/t5_2rpt9/styles/communityIcon_iyl98xuwsp251.png",
        "detailLink": "#"
    }
];

const positionList = document.getElementById('position-list');
const jobCards = jobData.map(job => `
    <div id="position-card" class="position-card">
        <img src=${job.image} alt="Southern Methodist University: Home of the Mustangs" data-noaft="1" style="width: 128px; height: 128px; margin: 0px;">
        <div id="job-description" class="job-description" style="
            display: flex;
            flex-direction: column;
            /* background-color: yellow; */
        ">
            <h5 style="
                font-weight: bold;
            ">${job.title}</h5>
            <h7 style="
                color: #888;
                font-weight: normal;
            ">${job.pay}, ${job.hours}</h7>
            <h7 style="
                color: #888;
                font-weight: normal;
            ">Faculty: ${job.faculty}</h7>
        </div>
        <div id="job-description" class="job-description" style="
            display: flex;
            flex: 1;
            flex-direction: row;
            /* background-color: yellow; */
            justify-content: flex-end;
            padding-right: 10px;
        ">
            <h5>View detail</h5>
        </div>
    </div>
    <br/>
`).join('');

positionList.innerHTML = jobCards;