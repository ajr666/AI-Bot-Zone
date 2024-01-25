/*游戏对象管理器，用于管理游戏中的各种对象*/ 

const AC_GAME_OBJECTS = []; //用于存储游戏的所有对象

export class AcGameObject{
    constructor(){//游戏对象构造函数
        AC_GAME_OBJECTS.push(this); //将当前游戏对象存储到游戏对象数组中
        this.timedelta=0;//这一帧执行时刻距离上一帧执行时刻时间间隔
        this.has_called_start=false;
    }

    start(){ // 只会在游戏对象创建后第一次执行

    }

    update(){ // 每一帧执行一次，除了第一帧

    }

    on_destroy(){ // 删除之前执行

    }

    destroy(){
        for(let i in AC_GAME_OBJECTS){
            const obj = AC_GAME_OBJECTS[i];
            if(obj===this){
                AC_GAME_OBJECTS.splice(i);
                break;
            }
        }
    }
}

let last_timestamp; //上一次执行时刻

const step= timestamp =>{
    for(let obj of AC_GAME_OBJECTS){
        if(!obj.has_called_start){
            obj.has_called_start=true;
            obj.start();
        }
        else{
            obj.timedelta=timestamp-last_timestamp;
            obj.update();
        }
    }

    last_timestamp = timestamp;
    requestAnimationFrame(step)//在下一帧执行step函数
}

requestAnimationFrame(step)