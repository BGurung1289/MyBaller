INSERT INTO postcode(Postcode, Street, City, Country) VALUES("HP14 4UT", "Kilnwood", "Naphill", "United Kingdom");

INSERT INTO bballcourt(Postcode, CourtID) values((select Postcode from postcode where Postcode = "HP14 4UT"), 1011);

INSERT INTO video(Video_ID, Video_Title, Video_URL) values(1,"dribbling form","https://www.youtube.com/");

INSERT INTO 
select * from video;

