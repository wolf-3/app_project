function back(){
	window.location.href="/backapplist.html";
}
function changeStatus(status) {
    $.ajax({
        type:"get",
        url:"/changestatus?status="+status+"&id="+$("#appId").val(),
        dataType:"json",
        success:function(data){
            if(data.info != "" && data.info != null){
                alert("操作成功！");
                $("#valueName").val(data.info);
            }
        },
        error:function(){
            alert("数据提交失败");
        }
    })
}