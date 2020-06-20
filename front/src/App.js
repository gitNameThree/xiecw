import React from 'react';
import {Button} from 'antd';

import {postData} from "./utils/RequestUtil";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.startCommand = this.startCommand.bind(this);
        this.stopCommand = this.stopCommand.bind(this);
    }

    startCommand() {
        console.info("----------------")
        const url = "/schedule/startCommand";
        postData(url, "").then(data => {
            if (data) {
                alert("请求命令发送成功")
            }
        });
    }

    stopCommand() {
        console.info("----------------")
        const url = "/schedule/stopCommand";
        postData(url, "").then(data => {
            if (data) {
                alert("请求命令发送成功")
            }
        });
    }

    render() {
        return (
            <div className="App">
                <Button type="primary"
                        onClick={() => {
                            this.startCommand();
                        }}
                >
                    执行调度任务
                </Button>
                <Button type="primary"
                        onClick={() => {
                            this.stopCommand();
                        }}
                >结束调度任务
                </Button>
            </div>
        );
    }

}

export default App;
