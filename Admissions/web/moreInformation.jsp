<%-- 
    Document   : MoreInformation
    Created on : Oct 29, 2023, 4:13:14 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${name}</title>
        <link rel="stylesheet" href="style/MoreInformation/style.css"/>
    </head>
    <body>
        <div class="header">
            <div class="header-left">
                <img src="" alt="">
            </div>
            <div class="header-middle">
                <ul>
                    <li><a href="/Admissions/UserPage.jsp">HOME</a></li>
                    <li><a href="/Admissions/News.jsp">NEWS</a></li>
                    <li><a href="/Admissions/university">UNIVERSITY</a></li>
                    <li><a href="/Admissions/majorList">MAJOR</a></li>
                    <li><a href="/Admissions/contactus.jsp">CONTACT</a></li>
                </ul>
            </div>
            <div class="header-right">
                <i></i>
            </div>
        </div>
        <div class="container">
            <h1>${name}</h1>
            <h2>${describe}</h2>
            <p>Trường Đại học kinh tế quốc dân là một trường đại học uy tín tại Việt Nam với các chương trình đào tạo chất lượng và sự hỗ trợ cho sự phát triển nghề nghiệp của sinh viên.</p>
            <h2>Mã liên quan:</h2>
            <div class="address">
                <div>MÃ TUYỂN SINH: 00000000</div> <br>
                <div>MÃ NGÀNH: P09189</div>
            </div>
            <h2>Overview</h2>
            <div class="address">
                <div>Day Open Register: ${dayopen}</div> <br>
                <div>Day Close Register: ${dayclose}</div> <br>
                <div>Quantity Of Admissions: ${quantity}</div> <br>
                <div>Additions Admissions: ${additions}</div>
            </div>
            <h2>Thông tin liên hệ:</h2>
            <div class="address">
                <p>THÔNG TIN LIÊN HỆ: VIỆN CÔNG NGHỆ THÔNG TIN VÀ KINH TẾ SỐ</p>
                <p>Địa chỉ: Phòng 13.11 tòa nhà A1, Trường Đại học Kinh tế Quốc dân.</p>
                <p>Số điện thoại: 024.36280.280 (6363; 6324)</p>
                <p>Email: https://sitde@neu.edu.vn</p>
                <p>Website: https://sitde.neu.edu.vn</p>
            </div>
            <h2>Giới thiệu ngắn gọn về ngành:</h2>
            <div class="address">
                <p style="text-align: justify;">Sinh viên có hiểu biết cơ bản về kinh tế, quản lý và quản trị kinh doanh; kiến thức, 
                    kỹ năng chuyên sâu về Khoa học máy tính. Đào tạo tập trung vào nghiên cứu và phát triển về khoa học máy tính; 
                    công nghệ phần mềm; hệ thống thông tin nhằm đáp ứng các yêu cầu của các tổ chức và doanh nghiêp. 
                    Phát huy năng lực tự nghiên cứu bổ sung kiến thức theo yêu cầu của công việc và học tập nâng cao.
                </p>
            </div>
            <h2>Cơ hội nghề nghiệp:</h2>
            <div class="address">
                <p>Sinh viên tốt nghiệp ngành KHMT có cơ hội làm việc:</p>
                <ul>
                    <li>Nghiên cứu chuyên sâu về khoa học máy tính.</li>
                    <li>Lập trình, phát triển, gia công các dự án phần mềm.</li>
                    <li>Xây dựng các hệ thống phân tích dữ liệu.</li>
                    <li>Nghiên cứu triển khai các hệ thống thông tin cho các tổ chức và doanh nghiệp.</li>
                    <li>Nghiên cứu chuyển giao công nghệ và vận hành hệ thống phần mềm.</li>
                </ul>
            </div>
            <button style="display: flex; justify-content: center; align-items: center; margin-left: 44%"><a href="/Admissions/UserPage.jsp">SEND TO ADMIN</a></button>
        </div>
    </body>
</html>
