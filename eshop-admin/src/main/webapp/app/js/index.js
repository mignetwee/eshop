// index操作
$(function() {
    App.init();

    var Index = (function() {
        var me = {};

        function changeMenu(title){
        	$('#index-page-title').html(title);
        	$('#index-menu2').html(title);
        	
        }
        function changeHeader(header){
        	$('#index-menu').html(header)
        }
        // 处理一级菜单点击
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
            	//移除其他选择样式
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');
            });
        };

        // 处理子菜单点击[点击之后，在中间内容区域加载内容]
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                	//设置引导显示menu>menu2
                	console.log('url:'+url);
                	changeMenu(this.text);
                	$.ajax({
                		  type :"GET",
                		  url :url,
                		  success :function(data){
                			  $('#main-content').html(data);
                		  },
                		  //async :false,
                		  error:function(XmlHttpRequest,textStatus, errorThrown)
                		  {
                			  console.log(XmlHttpRequest.status);
                			  console.log(textStatus);
                              $('#main-content').html(XmlHttpRequest.responseText);
                		  }
                		});
                }
            });
        };

        me.init = function() {
        	//set bootbox locale
        	bootbox.setDefaults({locale:"zh_CN"});
            me.handleMenuClick();
            me.handleSubMenuClick();
        };

        return me;
    })();

    Index.init();
    //触发点击事件,点击首页
    $('#btn-dashboard').trigger("click");
});
