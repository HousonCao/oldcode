<?php
 include("conn.php");
error_reporting(0);
 $title=$_POST["title"];
 $content=$_POST["content"];
 $time=date("Y-m-j");
 mysql_query("insert into gonggao (title,content,time) values ('$title','$content','$time')",$conn);
 echo "<script>alert('������ӳɹ�!');history.back();</script>";
?>