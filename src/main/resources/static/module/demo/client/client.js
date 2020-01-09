/**
 * 顾客管理
 */
var pageCurr;
var form;

$(function() {

    layui.use('table', function(){
        var table = layui.table;
        form = layui.form;

        tableIns=table.render({
            elem: '#clientList',
            url:'client/findList',
            method: 'post', //默认：get请求
            cellMinWidth: 100,
            page: true,
            request: {
                /*pageName: 'pageNum', //页码的参数名称，默认：pageNum
                limitName: 'pageSize' //每页数据量的参数名，默认：pageSize*/
            },
            response:{
                statusName: 'searchCount', //数据状态的字段名称，默认：code
                statusCode: true, //成功的状态码，默认：0
                countName: 'total', //数据总数的字段名称，默认：count
                dataName: 'records' //数据列表的字段名称，默认：data
            },
            cols: [[
                {field:'clientName', title:'顾客名称',align:'center'}
                ,{field:'clientSex', title:'顾客性别',align:'center'}
                ,{field:'clientPhone', title:'联系方式',align:'center'}
                ,{field:'clientAddress', title:'顾客住址',align:'center'}
                ,{field:'clientGrade', title:'顾客等级',align:'center'}
                ,{field:'money', title:'消费金额',align:'center'}
                ,{field:'num', title:'消费次数',align:'center'}
                ,{field:'clientFen', title:'消费积分',align:'center'}
                ,{field:'createTime', title:'创建时间',align:'center'}
                ,{fixed:'right',title:'操作',align:'center', toolbar:'#optBar'}
            ]],
            done: function(res, curr, count){
                $("[data-field='clientSex']").children().each(function(){
                    if($(this).text()=='1'){
                        $(this).text("女")
                    }else if($(this).text()=='0'){
                        $(this).text("男")
                    }
                });
                pageCurr=curr;

            }
        });
        //监听工具条
        table.on('tool(clientTable)', function(obj){
            var data = obj.data;
            if(obj.event === 'del'){
                //删除
                delRole(data,data.id);
            } else if(obj.event === 'edit'){
                //编辑
                edit(data);
            }else if(obj.event === 'recover'){
                //恢复
                recoverRole(data,data.id);
            }
        });
    });

//重新加载table
    function load(obj){
        tableIns.reload({
            where: obj.f
            , page: {
                curr: pageCurr //从当前页码开始
            }
        });
    }

});








