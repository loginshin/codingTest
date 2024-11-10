function solution(park, routes) {
    let currentLocation = findStartLocation(park);

    routes.forEach(action => {
        currentLocation = validateAndMove(park, currentLocation, action);
    });

    return currentLocation
}

function findStartLocation(park) {
    for (let y = 0; y < park.length; y++) {
        for (let x = 0; x < park[y].length; x++) {
            if (park[y][x] === 'S') {
                return [y, x];
            }
        }
    }
    return null;
}

function validateAndMove(park, currentLocation, action) {
    const [direction, steps] = action.split(" ");
    const moveCount = parseInt(steps, 10);
    const [y, x] = currentLocation;
    let newY = y, newX = x;

    for (let i = 0; i < moveCount; i++) {
        switch (direction) {
            case 'E': newX++; break;
            case 'S': newY++; break;
            case 'N': newY--; break;
            case 'W': newX--; break;
        }
        if (newY < 0 || newY >= park.length || newX < 0 || newX >= park[0].length || park[newY][newX] === 'X') {
            return currentLocation;
        }
    }

    return [newY, newX];
}
