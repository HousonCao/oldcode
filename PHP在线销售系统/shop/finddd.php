<?php
 include("top.php");

error_reporting(0); 
?>
<table width="800" height="438" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="200" height="438" valign="top" bgcolor="#E8E8E8"><div align="center">
	<?php include("left.php");?>
    </div></td>
    <td width="10" background="images/line2.gif">&nbsp;</td>
    <td width="590" valign="top"><table width="550" height="20" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td>&nbsp;</td>
      </tr>
    </table>
      <table width="550" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="25" bgcolor="#555555"><div align="center" style="color: #FFFFFF">������ѯ</div></td>
        </tr>
        <tr>
          <td height="50" bgcolor="#555555"><table width="550" height="50" border="0" align="center" cellpadding="0" cellspacing="1">
            <tr>
              <td bgcolor="#FFFFFF">
			  <table width="550" height="50" border="0" align="center" cellpadding="0" cellspacing="0">
			   <script language="javascript">
			     function chkinput3(form)
				 {
				   if((form.username.value=="")&&(form.ddh.value==""))
				    {
				      alert("�������¶����˻򶩵���");
					  form.username.select();
					  return(false);
				    }
				   return(true);
				    
				 }
			   </script>
                <form name="form3" method="post" action="finddd.php" onSubmit="return chkinput3( this)">
				<tr>
                  <td height="25"><div align="center">�¶���������:<input type="text" name="username" class="inputcss" size="25" style="background-color:#e8f4ff " onMouseOver="this.style.backgroundColor='#ffffff'" onMouseOut="this.style.backgroundColor='#e8f4ff'">
                    ������:<input type="text" name="ddh" size="25" class="inputcss" style="background-color:#e8f4ff " onMouseOver="this.style.backgroundColor='#ffffff'" onMouseOut="this.style.backgroundColor='#e8f4ff'"></div></td>
                </tr>
                <tr>
                  <td height="25">
                    <div align="center">
					    <input type="hidden" value="show_find" name="show_find">
                        <input name="submit" type="submit" class="buttoncss" value="�� ��" />
                    </div></td>
                </tr>
				 </form>
              </table></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="550" height="20" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td>&nbsp;</td>
        </tr>
      </table>
	  <?php
	    if($_POST["show_find"]!=null)
		 {
	      $username=trim($_POST["username"]);
		  $ddh=trim($_POST["ddh"]);
		  if($username=="")
		   {
		       $sql=mysql_query("select * from dingdan where dingdanhao='".$ddh."'",$conn);
		   }
		  elseif($ddh=="")
		  {
		      $sql=mysql_query("select * from dingdan where xiadanren='".$username."'",$conn);
		   }
		  else
		  {
		      $sql=mysql_query("select * from dingdan where xiadanren='".$username."'and dingdanhao='".$ddh."'",$conn);
		  }
		  $info=mysql_fetch_array($sql);
		  if($info==false)
		   {
		      echo "<div algin='center'>�Բ���,û�в��ҵ��ö���!</div>";    
		   }
		   else
		   {
	  ?>
	  <table width="550" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td height="25" bgcolor="#555555"><div align="center" style="color: #FFFFFF">��ѯ���</div></td>
        </tr>
        <tr>
          <td height="50" bgcolor="#555555"><table width="550" height="50" border="0" align="center" cellpadding="0" cellspacing="1">
            <tr>
              <td width="77" height="25" bgcolor="#FFFFFF"><div align="center">������</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">�µ��û�</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">������</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">����ܼ�</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">���ʽ</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">�տʽ</div></td>
              <td width="77" bgcolor="#FFFFFF"><div align="center">����״̬</div></td>
            </tr>
			<?php
			
			  do
			  {
			
			?>
            <tr>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["dingdanhao"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["xiadanren"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["shouhuoren"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["total"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["zfff"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["shff"];?></div></td>
              <td height="25" bgcolor="#FFFFFF"><div align="center"><?php echo $info["zt"];?></div></td>
            </tr>
			<?php
			   }while($info=mysql_fetch_array($sql));
			?>
          </table></td>
        </tr>
      </table>
	    <?php
		   }
		  }
		?>
</td>
  </tr>
</table>
<?php
 include("bottom.php");
?>