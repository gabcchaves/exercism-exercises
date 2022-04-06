const mod = require('./exercises');

describe('Hello World!', () => {
	test('Say Hi!', () => {
		expect(mod.hello()).toEqual('Hello, World!');
	});
});
