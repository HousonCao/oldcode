<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<table width="800" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="10" colspan="10" background="images/line1.gif"></td>
  </tr>
  <tr bgcolor="#E8E8E8">
    <td width="80" height="20"><div align="center"><a href="showph.php">��������</a></div></td>
    <td width="80"><div align="center"><a href="showtejia.php">�ؼ���Ʒ</a></div></td>
    <td width="80"><div align="center"><a href="gwlc.php">��������</a></div></td>
    <td width="80"><div align="center"> <a href="showpl.php">��Ʒ����</a></div></td>
    <td width="80"><div align="center"><a href="aboutus.php">��������</a></div></td>
    <td width="80"><div align="center"><a href="javascript:location.reload()" target="_self">ˢ��ҳ��</a></div></td>
  </tr>
  <tr >
    <td height="10" colspan="10" background="images/line1.gif"><div align="center"></div></td>
  </tr>
  <tr>
    <td height="50" colspan="10"><div align="center"><br>
   
<br>���Ǳ�վ��&nbsp;
<?php
  $countfile="count.txt";
   if(!file_exists($countfile))
	{
	 exec("echo 0 > $countfile");
	} 
 function displaycount($countfile)
  {
  include("admin/conn.php");
  $fp=fopen($countfile,"rw");
  $sum=fgets($fp,5);
  $ip=getenv("REMOTE_ADDR");
  $sql=mysql_query("select * from ip where ip='".$ip."'",$conn);
  $info=mysql_fetch_array($sql);
  if($info==false)
  { 
     mysql_query("insert into ip(ip) values ('$ip')",$conn);
	 $sum+=1;
  }	 
	 
	 echo $sum;
	 
	 exec("rm -rf $countfile");
	 exec("echo $sum > $countfile");
   }
   
   displaycount($countfile);
 

?>
 &nbsp;λ�ÿ�</div></td>
  </tr>
</table>
<?php
  include("endconn.php");
?>
</body>
</html>
